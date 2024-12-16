package com.sb.sblib.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * アカウントのDTO
 */
@Data
@Schema(description = "アカウントのDTO")
public class AccountDto {

	@Schema(description = "アカウントID", type = "integer", example = "100100100")
	private Integer taccountId;

	@Schema(description = "メールアドレス", type = "string", example = "guest@sblib.com")
	private String mailAddress;
}
