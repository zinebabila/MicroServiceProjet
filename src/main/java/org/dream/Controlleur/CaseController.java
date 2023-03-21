package org.dream.Controlleur;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.dream.model.CaseDto;
import org.dream.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicReference;

@RestController
@RequestMapping("Cases")
public class CaseController {
    @Autowired
    CaseService caseService;
    @GetMapping("/{caseId}")

    @ApiOperation(value = "View a case by id", response = CaseDto.class)
    @ApiResponses(value = {
                            @ApiResponse(code = 200, message = "Successfully retrieved case"),
                            @ApiResponse(code = 404, message = "Case not found")
                 })
    public CaseDto getCases(@ApiParam(value = "Id of the case to retrieve", required = true) @PathVariable String caseId){
        return  caseService.getCaseById(caseId,new AtomicReference<>());

    }

}
