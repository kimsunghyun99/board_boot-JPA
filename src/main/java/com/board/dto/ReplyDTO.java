package com.board.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.board.entity.BoardEntity;
import com.board.entity.FileEntity;
import com.board.entity.MemberEntity;
import com.board.entity.ReplyEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReplyDTO {
	private Long replyseqno;
	private Long seqno;
	private String email;
	private String replywriter;
	private String replycontent;
	private LocalDateTime replyregdate;
	
	
	
	//Entity --> DTO 
public ReplyDTO(ReplyEntity replyEntity) {
		
		this.replyseqno = replyEntity.getReplyseqno();
		this.seqno =replyEntity.getSeqno().getSeqno();
		this.email =replyEntity.getEmail().getEmail();
		this.replywriter =replyEntity.getReplywriter();
		this.replycontent =replyEntity.getReplycontent();
		this.replyregdate =replyEntity.getReplyregdate();
		
	}

	//DTO --> Entity
	
//public ReplyEntity dtotoEntity(ReplyDTO dto)  {
//
//ReplyEntity replyEntity = ReplyEntity.builder()
//			 										.replyseqno(dto.getReplyseqno())
//			 										.seqno(dto.getSeqno())
//		 										 .email(dto.getEmail())	 										 
//		 										 .replywriter(dto.getReplywriter())			 										 
//		 										 .replycontent(dto.getReplycontent())
//		 										 .replyregdate(dto.getReplyregdate())
//			 										 .build();
//			 										 return replyEntity;
//	 
//	 
}




	

