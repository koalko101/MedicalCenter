package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record TreatmentAppointmentDto(UUID id, NonDrugTreatmentType type, String name, Integer quantity, String dosage, String duration, LocalDate startedAt, LocalDate completedAt, MedicalWorkerDto prescriber, String notes, MedicalDocumentReferenceDto sourceDocument) {}

