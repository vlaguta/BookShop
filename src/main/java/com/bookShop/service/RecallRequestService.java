package com.bookShop.service;

import com.bookShop.dao.RecallRequestRepository;
import com.bookShop.model.RecallRequest;

public class RecallRequestService {

    private final RecallRequestRepository recallRequestRepository = new RecallRequestRepository();

    public void add(RecallRequest recallRequest) {
        recallRequestRepository.add(recallRequest);
    }
}
