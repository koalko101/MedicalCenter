package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record ConsentRecordDto(UUID id, ConsentType type, String subjectName, String legalRepresentativeName, String purpose, LocalDateTime providedAt, LocalDateTime withdrawnAt, String status, String informationProvided, MedicalDocumentReferenceDto sourceDocument) {}

