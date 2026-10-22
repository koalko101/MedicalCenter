package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record PrescriptionDto(UUID id, OrganizationDto organization, MedicalWorkerDto prescriber, String medicineName, String internationalNonproprietaryName, String groupName, String dosageForm, String dose, String prescriptionSeries, String prescriptionNumber, LocalDate prescribedAt, LocalDate dispensedAt, BigDecimal dispensedCost, String medicalDeviceName, MedicalDocumentReferenceDto sourceDocument) {}

