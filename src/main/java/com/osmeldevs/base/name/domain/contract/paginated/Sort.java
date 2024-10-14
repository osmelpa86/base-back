package com.osmeldevs.base.name.domain.contract.paginated;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Arrays;

@Data
@Accessors(chain = true)
public class Sort {

    private final String field;
    private final Criteria criteria;

    public static String ORDER_VALID_FORMAT = "^\\w+\\.\\w+$";

    public enum Criteria {
        ASC("asc"),
        DESC("desc");

        private final String criteria;

        private Criteria(String criteria) {
            this.criteria = criteria;
        }

        public String getCriteria() {
            return this.criteria;
        }

        public static boolean isSortCriteriaValid(String sortCriteria) {
            return Arrays.stream(values()).anyMatch(sc -> sc.getCriteria().equals(sortCriteria));
        }

        public boolean isSortCriteriaAsc() {
            return Criteria.ASC.equals(this);
        }

        public boolean isSortCriteriaDesc() {
            return Criteria.DESC.equals(this);
        }
    }

}
