package com.etz.abiolagbode.waxnote.dto.requestdto;

import com.etz.abiolagbode.waxnote.model.Waxnote;

public class RequestDTO {
	
private String name;
private String content;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getContent() {
	return content;
}

public void setContent(String content) {
	this.content = content;
}

@Override
public String toString() {
	return "RequestDTO [name=" + name + ", content=" + content + "]";
}

public Waxnote buildModel() {
	Waxnote waxnote = new Waxnote();
	waxnote.setName(this.name);
	waxnote.setContent(this.content);
	return waxnote;
}

}
