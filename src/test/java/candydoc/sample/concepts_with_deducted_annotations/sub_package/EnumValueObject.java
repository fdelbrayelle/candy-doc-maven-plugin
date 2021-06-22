package candydoc.sample.concepts_with_deducted_annotations.sub_package;

import io.candydoc.domain.annotations.CoreConcept;
import io.candydoc.domain.annotations.ValueObject;

@ValueObject(description = "My enum value object description")
public enum EnumValueObject {
    A {
        @Override
        public <T> T accept(Visitor<T> visitor) {
            return visitor.visitA();
        }
    },
    B {
        @Override
        public <T> T accept(Visitor<T> visitor) {
            return visitor.visitB();
        }
    },
    C {
        @Override
        public <T> T accept(Visitor<T> visitor) {
            return visitor.visitC();
        }
    };

    public abstract <T> T accept(Visitor<T> visitor);

    interface Visitor<T> {
        T visitA();
        T visitB();
        T visitC();
    }
}
