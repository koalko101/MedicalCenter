package com.medical.sensitive_data_repository.DTO;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record PatientPersonalDataDto(PersonNameDto name, String identificationNumber, LocalDate dateOfBirth, Integer ageYears, BiologicalSex sex, List<IdentityDocumentDto> identityDocuments, List<AddressDto> addresses, List<ContactDto> contacts, InsuranceContractDto insuranceContract, List<PatientRepresentativeDto> representatives) {
    public PatientPersonalDataDto {
        identityDocuments = DtoLists.immutable(identityDocuments);
        addresses = DtoLists.immutable(addresses);
        contacts = DtoLists.immutable(contacts);
        representatives = DtoLists.immutable(representatives);
    }
}

