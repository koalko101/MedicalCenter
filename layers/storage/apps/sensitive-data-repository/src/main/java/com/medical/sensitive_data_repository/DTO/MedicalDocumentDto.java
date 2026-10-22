package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record MedicalDocumentDto(UUID id, String documentType, String title, LocalDateTime createdAt, String registrationNumber, LocalDate registeredAt, OrganizationDto owner, List<DigitalSignatureDto> signatures, FileObjectReferenceDto file) {
    public MedicalDocumentDto {
        signatures = DtoLists.immutable(signatures);
    }
}

