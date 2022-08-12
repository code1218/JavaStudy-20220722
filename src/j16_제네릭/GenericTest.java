package j16_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GenericTest<T> {
	private int code;
	private T data;
}
