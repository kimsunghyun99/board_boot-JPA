package com.board.dto;

import java.time.LocalDateTime;

import com.board.entity.BoardEntity;
import com.board.entity.FileEntity;
import com.board.entity.MemberEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FileDTO {
	private Long fileseqno;
	private Long seqno;
	private String email;
	private String org_filename;
	private String stored_filename;
	private Long filesize;
	private String checkfile;
	
	
	//Entity --> DTO 
	public FileDTO(FileEntity fileEntity) {
		
		this.fileseqno =fileEntity.getFileseqno();
		this.seqno =fileEntity.getSeqno();
		this.email =fileEntity.getEmail();
		this.org_filename =fileEntity.getOrg_filename();
		this.stored_filename =fileEntity.getStored_filename();
		this.filesize =fileEntity.getFilesize();
		this.checkfile =fileEntity.getCheckfile();
		
		
	}
	
	//DTO --> Entity
	 public FileEntity dtotoEntity(FileDTO dto)  {

		 FileEntity fileEntity = FileEntity.builder()
				 										 .email(dto.getEmail())
				 										 .fileseqno(dto.getFileseqno())
				 										 .seqno(dto.getSeqno())
				 										 .email(dto.getEmail())
				 										 .org_filename(dto.getOrg_filename())
				 										 .stored_filename(dto.getStored_filename())
				 										 .filesize(dto.getFilesize())
				 										 .checkfile(dto.getCheckfile())
				 										 .build();
				 										 return fileEntity;
		 
		 
	 }
	
	
	
}
