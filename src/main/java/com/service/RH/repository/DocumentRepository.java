package com.service.RH.repository;

import com.service.RH.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    @Query("select d from Document d where d.titreDoc = :titre")
    List<Document> findDocumentByTitle (@Param("titre") String titre);

    @Query("select d from Document d where d.typeDoc = :type")
    List<Document> findByDocumentType (@Param("type") String type);
}
