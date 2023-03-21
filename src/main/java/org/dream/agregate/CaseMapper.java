package org.dream.agregate;

import org.dream.domain.entities.CaseEntity;
import org.dream.model.CaseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CaseMapper {
    CaseDto toDto(CaseEntity  caseEntity);
    CaseEntity toEntity(CaseDto caseDto);

}
