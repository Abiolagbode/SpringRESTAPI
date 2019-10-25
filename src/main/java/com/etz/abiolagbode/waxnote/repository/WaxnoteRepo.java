package com.etz.abiolagbode.waxnote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etz.abiolagbode.waxnote.model.Waxnote;

@Repository
public interface WaxnoteRepo extends JpaRepository<Waxnote, Long> {

}
