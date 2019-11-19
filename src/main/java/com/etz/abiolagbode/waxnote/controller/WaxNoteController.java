package com.etz.abiolagbode.waxnote.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.etz.abiolagbode.waxnote.dto.requestdto.RequestDTO;
import com.etz.abiolagbode.waxnote.dto.response.ResponseDTO;
import com.etz.abiolagbode.waxnote.exception.ResourceNotFoundException;
import com.etz.abiolagbode.waxnote.model.Waxnote;
import com.etz.abiolagbode.waxnote.repository.WaxnoteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
@Api(value="notes", description="Operations pertaining to online notes")
// @CrossOrigin(origins = "http://localhost:3211", allowCredentials = "true")
public class WaxNoteController {
	
	@Autowired
	WaxnoteRepo waxnoteRepo;
	
	@ApiOperation(value = "View a list of available notes", response = Iterable.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	@GetMapping("/notes")
	@CrossOrigin
public List<Waxnote> getAllNote(){
	return waxnoteRepo.findAll();
}
	
	//save data
	@ApiOperation(value = "Save a note ")
	@PostMapping("/notes")
	@CrossOrigin
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
		    @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	        @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	public ResponseDTO createNote(@Valid @RequestBody RequestDTO requestDTO) {
		Waxnote nWaxnote = waxnoteRepo.save(requestDTO.buildModel());
		ResponseDTO responsdto = new ResponseDTO();
		responsdto.setContent(nWaxnote.getContent());
		responsdto.setName(nWaxnote.getName());
		return responsdto;
	}
	
	
	@ApiOperation(value = "Get a note")
	@CrossOrigin
	@GetMapping("/notes/{id}")
	public Waxnote getById(@PathVariable (value = "id") Long noteId) {
		return waxnoteRepo.findById(noteId)
				.orElseThrow(() -> new ResourceNotFoundException("NoteId", "id", noteId));
		
	}
	
	@ApiOperation(value = "Update a note")
	@CrossOrigin
	@PutMapping("/notes/{id}")
	public Waxnote updateNote(@PathVariable (value = "id") Long noteId, @Valid @RequestBody
			Waxnote noteDetail)
			{
				System.out.println("working");
		Waxnote waxnote = waxnoteRepo.findById(noteId)
				.orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
		waxnote.setName(noteDetail.getName());
		waxnote.setContent(noteDetail.getContent());

		Waxnote updateNote = waxnoteRepo.save(waxnote);
		return updateNote;
	}
	
	@ApiOperation(value = "Delete a note")
	@CrossOrigin
	@DeleteMapping("/notes/{id}")
	public ResponseEntity<?> deletingNote(@PathVariable (value = "id") Long noteId){
		Waxnote waxnote = waxnoteRepo.findById(noteId)
				.orElseThrow(() -> new ResourceNotFoundException("Note", "id", noteId));
		waxnoteRepo.delete(waxnote);
		return ResponseEntity.ok().build();
	}
	
	
	

}
