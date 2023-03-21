package org.dream.service;

import org.dream.agregate.CaseMapper;
import org.dream.domain.entities.CaseEntity;
import org.dream.domain.repository.CaseEntityRepository;
import org.dream.exceptions.CaseException;
import org.dream.model.CaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
@Service
@Transactional
public class CaseServiceImpl implements CaseService{
    private final CaseEntityRepository caseEntityRepository;
    private  final CaseMapper caseMapper;
    public CaseServiceImpl(final CaseEntityRepository caseEntityRepository, final CaseMapper caseMapper) {
        this.caseEntityRepository = caseEntityRepository;
        this.caseMapper = caseMapper;
    }


;
    @Override
    public CaseDto getCaseById(String caseId, AtomicReference<String> user) {
        if(caseId==null){
            throw new CaseException(Constants.NoIdGet);
        }else{
            return caseMapper.toDto(caseEntityRepository.findCaseEntitiesByCaseId(caseId));
        }
        //Code de prof
/*
        return Optional.ofNullable(caseId)
                .map(caseI->caseMapper.toDto((caseEntityRepository.findCaseEntitiesByCaseId(caseId))))
                .orElseThrow(()->new CaseException("Id est Null erreur de get")) ;*/
    }

    @Override
    public CaseDto CreateCase(CaseDto caseDto) {
        if(caseDto==null){
            throw new CaseException(Constants.NoCase);
        }else{
        return caseMapper.toDto(caseEntityRepository.save(caseMapper.toEntity(caseDto)));}
    }

    @Override
    public CaseDto modifiyCaseDto(String caseId, CaseDto caseDto) {
        if(caseId==null){
            throw new CaseException(Constants.NoIdPut);
        }else{
        CaseEntity caseEntity=caseEntityRepository.findCaseEntitiesByCaseId(caseId);
        caseEntity.setTitle(caseDto.getTitle());
        caseEntity.setDescription(caseDto.getDescription());
        caseEntity.setCreationDate(caseDto.getCreationDate());
        caseEntity.setLastUpdateDate(caseDto.getLastUpdateDate());
        return caseMapper.toDto(caseEntityRepository.save(caseEntity));}
    }

    @Override
    public CaseDto deleteCase(String caseId) {
        if(caseId==null){
            throw new CaseException(Constants.NoIdDelete);
        }else{
        return caseMapper.toDto(caseEntityRepository.deleteCaseEntitiesByCaseId(caseId));}
    }
}
