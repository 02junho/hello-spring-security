package kr.ac.hansung.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {

    @NotBlank(message = "상품명을 입력하세요")  // 공백/빈 문자열 불가
    private String name;

    @Min(value = 0, message = "가격은 0 이상이어야 합니다")  // 음수 불가
    private int price;

    private String description;

    @Min(value = 0, message = "재고는 0 이상이어야 합니다")  // 음수 불가
    private int stock;
}
