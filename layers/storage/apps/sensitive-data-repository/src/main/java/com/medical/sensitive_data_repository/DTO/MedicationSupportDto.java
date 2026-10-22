package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record MedicationSupportDto(List<PrescriptionDto> subsidizedPrescriptions, List<PrescriptionDto> nonSubsidizedPrescriptions, List<NonPrescriptionAppointmentDto> nonPrescriptionAppointments) {
    public MedicationSupportDto {
        subsidizedPrescriptions = DtoLists.immutable(subsidizedPrescriptions);
        nonSubsidizedPrescriptions = DtoLists.immutable(nonSubsidizedPrescriptions);
        nonPrescriptionAppointments = DtoLists.immutable(nonPrescriptionAppointments);
    }
}

