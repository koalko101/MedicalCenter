package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record NonPrescriptionAppointmentDto(UUID id, String medicineOrDeviceName, String dose, String dosageForm, String frequency, String duration, MedicalWorkerDto prescriber, MedicalDocumentReferenceDto sourceDocument) {}

