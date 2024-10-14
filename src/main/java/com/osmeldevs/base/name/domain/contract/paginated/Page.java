package com.osmeldevs.base.name.domain.contract.paginated;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Page {
	private final Integer number;
	private final Integer size;
}
