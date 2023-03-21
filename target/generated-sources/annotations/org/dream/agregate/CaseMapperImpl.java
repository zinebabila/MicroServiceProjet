package org.dream.agregate;

import javax.annotation.processing.Generated;
import org.dream.domain.entities.CaseEntity;
import org.dream.domain.entities.CaseEntity.CaseEntityBuilder;
import org.dream.model.CaseDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-20T15:33:28+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class CaseMapperImpl implements CaseMapper {

    @Override
    public CaseDto toDto(CaseEntity caseEntity) {
        if ( caseEntity == null ) {
            return null;
        }

        CaseDto caseDto = new CaseDto();

        caseDto.setCaseId( caseEntity.getCaseId() );
        caseDto.setCreationDate( caseEntity.getCreationDate() );
        caseDto.setDescription( caseEntity.getDescription() );
        caseDto.setLastUpdateDate( caseEntity.getLastUpdateDate() );
        caseDto.setTitle( caseEntity.getTitle() );

        return caseDto;
    }

    @Override
    public CaseEntity toEntity(CaseDto caseDto) {
        if ( caseDto == null ) {
            return null;
        }

        CaseEntityBuilder caseEntity = CaseEntity.builder();

        caseEntity.caseId( caseDto.getCaseId() );
        caseEntity.creationDate( caseDto.getCreationDate() );
        caseEntity.description( caseDto.getDescription() );
        caseEntity.lastUpdateDate( caseDto.getLastUpdateDate() );
        caseEntity.title( caseDto.getTitle() );

        return caseEntity.build();
    }
}
