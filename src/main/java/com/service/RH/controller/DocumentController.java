package com.service.RH.controller;

import com.service.RH.model.Document;
import com.service.RH.service.DocumentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DocumentController {
    @Autowired
    DocumentServiceImp documentService;

    // http://localhost:8089/SpringMVC/retrieve-all-document
    @GetMapping("/retrieve-all-document")
    public List<Document> list() {
        return documentService.findAllDocuments();
    }

    //http://localhost:8089/SpringMVC/add-document
    @PostMapping("/add-document")
    public void add(@RequestBody Document document) {
        documentService.addDocument(document);
    }

    @GetMapping("/document/titre/{titre}")
    public List<Document> findDocumentByTitle(@PathVariable String titre){
        return documentService.findDocumentByTitle(titre);
    }

    @GetMapping("/document/type/{type}")
    public List<Document> findByDocumentType(@PathVariable String type){
        return documentService.findByDocumentType(type);
    }

}
