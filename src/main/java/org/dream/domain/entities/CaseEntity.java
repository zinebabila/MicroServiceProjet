package org.dream.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CaseEntity {
    @Id
    private String caseId;
    private LocalDateTime creationDate;
    private String description;
    private LocalDateTime lastUpdateDate;
    private  String title;




}
