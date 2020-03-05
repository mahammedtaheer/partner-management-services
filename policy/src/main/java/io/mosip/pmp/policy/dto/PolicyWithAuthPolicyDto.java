package io.mosip.pmp.policy.dto;

import java.util.List;

import lombok.Data;

/**
 * <p>This class contains objects of policyCreateResponseDto @link {@link PolicyCreateResponseDto}</p>
 * <p> list of auth policies {@link PolicyDto}.</p>
 * 
 * @author Nagarjuna Kuchi
 *
 */
@Data
public class PolicyWithAuthPolicyDto {

	private PolicyCreateResponseDto policy;
	
	private List<PolicyDto> authPolicies;
}
