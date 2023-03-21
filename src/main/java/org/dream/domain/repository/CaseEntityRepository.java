package org.dream.domain.repository;


import org.dream.domain.entities.CaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseEntityRepository extends JpaRepository<CaseEntity,String> {
    CaseEntity findCaseEntitiesByCaseId(String caseId);
    CaseEntity deleteCaseEntitiesByCaseId(String caseId);
}
