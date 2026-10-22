package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record TemporaryDisabilityDto(UUID id, String documentType, String documentSeries, String documentNumber, String disabilityType, String diagnosisCode, String diagnosisName, LocalDate startedAt, LocalDate endedAt, MedicalWorkerDto issuedBy, MedicalDocumentReferenceDto sourceDocument) {}

