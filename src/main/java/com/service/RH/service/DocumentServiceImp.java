package com.service.RH.service;

import com.service.RH.model.Document;
import com.service.RH.repository.DocumentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class DocumentServiceImp implements IDocumentService  {

    @Autowired
    private DocumentRepository documentRepository;

    @Override
    @Transactional
    public List<Document> findAllDocuments() {
        List<Document> Documents =  documentRepository.findAll();
        return Documents;
    }

    @Override
    public Document addDocument(Document d) {
        return documentRepository.save(d);
    }

    @Override
    public List<Document> findDocumentByTitle(String titre) {
        List<Document> Documents =  documentRepository.findDocumentByTitle(titre);
        return Documents;
    }

    @Override
    public List<Document> findByDocumentType(String type) {
        List<Document> Documents =  documentRepository.findByDocumentType(type);
        return Documents;
    }
}
