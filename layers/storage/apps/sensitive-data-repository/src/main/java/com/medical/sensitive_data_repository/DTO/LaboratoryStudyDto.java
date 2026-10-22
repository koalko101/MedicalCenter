package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record LaboratoryStudyDto(UUID id, String studyName, LocalDateTime performedAt, String organizationName, List<LabResultDto> results, String conclusion, MedicalDocumentReferenceDto sourceDocument) {
    public LaboratoryStudyDto {
        results = DtoLists.immutable(results);
    }
}

