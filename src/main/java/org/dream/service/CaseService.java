package org.dream.service;

import org.dream.model.CaseDto;

import java.util.concurrent.atomic.AtomicReference;

public interface CaseService {
    CaseDto getCaseById(String caseId, AtomicReference<String> user);
    CaseDto CreateCase(CaseDto caseDto);
    CaseDto modifiyCaseDto(String caseId,CaseDto caseDto);
    CaseDto deleteCase(String caseId);
}
