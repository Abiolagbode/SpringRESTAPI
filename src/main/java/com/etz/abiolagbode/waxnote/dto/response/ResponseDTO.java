package com.etz.abiolagbode.waxnote.dto.response;

public class ResponseDTO {
	
	private String name;
	private String content;
	private String createdAt;
	private String updatedAt;
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
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	@Override
	public String toString() {
		return "ResponseDTO [name=" + name + ", content=" + content + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}
	
	

}
