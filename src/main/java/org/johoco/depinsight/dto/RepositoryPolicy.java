package org.johoco.depinsight.dto;

import lombok.Builder;
import lombok.Data;

/**
 *
 *
 * @author John Hoestje
 */
@Data
@Builder
public class RepositoryPolicy {
	private String enabled;
	private String updatePolicy;
	private String checksumPolicy;
}
