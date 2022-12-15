package com.alibknc.hrmanagementapp.client.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@Getter
@Setter
@Builder
public class ContactInfoDto implements Serializable {

    String phoneNumber;

    String email;

    String city;

    String country;

    String address;

    int postCode;

}
