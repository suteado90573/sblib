package com.sb.sblib.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * エラー発生時に返却されるDTO
 */
@Data
@Schema(description = "エラー発生時に返却されるDTO")
public class ErrorDto {

	@Schema(description = "エラーコード", type = "integer", example = "100100100")
	private Integer errCd;

	@Schema(description = "エラーメッセージ", type = "string", example = "エラーが発生しました。")
	private String errMsg;
}
