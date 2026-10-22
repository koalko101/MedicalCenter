package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record ImagingStudyDto(UUID id, String modality, String studyName, LocalDateTime performedAt, String organizationName, String conclusion, List<FileObjectReferenceDto> imageFiles, MedicalDocumentReferenceDto sourceDocument) {
    public ImagingStudyDto {
        imageFiles = DtoLists.immutable(imageFiles);
    }
}

