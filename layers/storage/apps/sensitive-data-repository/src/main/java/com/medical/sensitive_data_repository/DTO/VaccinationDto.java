package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record VaccinationDto(UUID id, String vaccineName, String diseaseTarget, LocalDate administeredAt, String dose, String series, String organizationName, String medicalWorkerName, String reaction, MedicalDocumentReferenceDto sourceDocument) {}

