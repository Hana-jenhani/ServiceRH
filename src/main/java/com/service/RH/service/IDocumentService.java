package com.service.RH.service;

import com.service.RH.model.Document;

import java.util.List;

public interface IDocumentService {
    List<Document> findAllDocuments();

    Document addDocument(Document d);


    List<Document> findDocumentByTitle(String titre);

    List<Document> findByDocumentType(String type);
}
