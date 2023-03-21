package org.dream.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CaseDto {
    private String caseId;
    private LocalDateTime creationDate;
    private String description;
    private LocalDateTime lastUpdateDate;
    private  String title;
}
