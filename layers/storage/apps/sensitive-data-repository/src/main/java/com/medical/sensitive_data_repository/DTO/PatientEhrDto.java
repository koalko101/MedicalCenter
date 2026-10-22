package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record PatientEhrDto(UUID patientId, PatientSummaryDto summary, PatientPersonalDataDto personalData, PatientMedicalDataDto medicalData, List<VaccinationDto> vaccinations, List<DiagnosisDto> finalDiagnoses, List<LaboratoryStudyDto> laboratoryStudies, List<ImagingStudyDto> imagingStudies, List<FunctionalStudyDto> functionalStudies, List<SurgicalInterventionDto> surgicalInterventions, List<EmergencyMedicalCaseDto> emergencyMedicalCases, MedicationSupportDto medicationSupport, NonDrugTreatmentDto nonDrugTreatment, List<DispensaryObservationDto> dispensaryObservations, List<TemporaryDisabilityDto> temporaryDisabilities, List<DisabilityAssessmentDto> disabilityAssessments, List<RegistryMembershipDto> registryMemberships, List<ConsentRecordDto> consents, List<MedicalDocumentDto> sourceDocuments) {
    public PatientEhrDto {
        vaccinations = DtoLists.immutable(vaccinations);
        finalDiagnoses = DtoLists.immutable(finalDiagnoses);
        laboratoryStudies = DtoLists.immutable(laboratoryStudies);
        imagingStudies = DtoLists.immutable(imagingStudies);
        functionalStudies = DtoLists.immutable(functionalStudies);
        surgicalInterventions = DtoLists.immutable(surgicalInterventions);
        emergencyMedicalCases = DtoLists.immutable(emergencyMedicalCases);
        dispensaryObservations = DtoLists.immutable(dispensaryObservations);
        temporaryDisabilities = DtoLists.immutable(temporaryDisabilities);
        disabilityAssessments = DtoLists.immutable(disabilityAssessments);
        registryMemberships = DtoLists.immutable(registryMemberships);
        consents = DtoLists.immutable(consents);
        sourceDocuments = DtoLists.immutable(sourceDocuments);
    }
}

