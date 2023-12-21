package com.board.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.board.entity.FileEntity;

public interface FileRepository extends JpaRepository<FileEntity, Long> {
	
	
	 //   첨부파일 목록보기  select * from tbl_file where seqno = #{seqno} and checkfile = 'Y'
      public List<FileEntity> findBySeqnoAndCheckfile(Long seqno, String checkfile);
	
      
      public List<FileEntity> findBySeqno(Long seqno);
      
      
      
      
	// 다운로드를 위한 파일 정보 가져오기  select * from tbl_file where fileseqno = #{fileseqno}
      
	

}
