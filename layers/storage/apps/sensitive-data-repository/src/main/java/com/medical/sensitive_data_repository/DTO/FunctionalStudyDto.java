package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record FunctionalStudyDto(UUID id, String studyName, LocalDateTime performedAt, String organizationName, String results, String conclusion, List<FileObjectReferenceDto> graphicFiles, MedicalDocumentReferenceDto sourceDocument) {
    public FunctionalStudyDto {
        graphicFiles = DtoLists.immutable(graphicFiles);
    }
}

