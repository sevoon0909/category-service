package com.example.categoryservice.service;

import com.example.categoryservice.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
