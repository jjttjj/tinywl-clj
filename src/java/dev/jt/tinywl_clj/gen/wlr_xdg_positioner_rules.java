// Generated by jextract

package dev.jt.tinywl_clj.gen;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct wlr_xdg_positioner_rules {
 *     struct wlr_box anchor_rect;
 *     enum xdg_positioner_anchor anchor;
 *     enum xdg_positioner_gravity gravity;
 *     enum xdg_positioner_constraint_adjustment constraint_adjustment;
 *     bool reactive;
 *     bool has_parent_configure_serial;
 *     uint32_t parent_configure_serial;
 *     struct {
 *         int32_t width;
 *         int32_t height;
 *     } size, parent_size;
 *     struct {
 *         int32_t x;
 *         int32_t y;
 *     } offset;
 * }
 * }
 */
public class wlr_xdg_positioner_rules {

    wlr_xdg_positioner_rules() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wlr_box.layout().withName("anchor_rect"),
        C.C_INT.withName("anchor"),
        C.C_INT.withName("gravity"),
        C.C_INT.withName("constraint_adjustment"),
        C.C_BOOL.withName("reactive"),
        C.C_BOOL.withName("has_parent_configure_serial"),
        MemoryLayout.paddingLayout(2),
        C.C_INT.withName("parent_configure_serial"),
        wlr_xdg_positioner_rules.size.layout().withName("size"),
        wlr_xdg_positioner_rules.size.layout().withName("parent_size"),
        wlr_xdg_positioner_rules.offset.layout().withName("offset")
    ).withName("wlr_xdg_positioner_rules");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout anchor_rect$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("anchor_rect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_box anchor_rect
     * }
     */
    public static final GroupLayout anchor_rect$layout() {
        return anchor_rect$LAYOUT;
    }

    private static final long anchor_rect$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_box anchor_rect
     * }
     */
    public static final long anchor_rect$offset() {
        return anchor_rect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_box anchor_rect
     * }
     */
    public static MemorySegment anchor_rect(MemorySegment struct) {
        return struct.asSlice(anchor_rect$OFFSET, anchor_rect$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_box anchor_rect
     * }
     */
    public static void anchor_rect(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, anchor_rect$OFFSET, anchor_rect$LAYOUT.byteSize());
    }

    private static final OfInt anchor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("anchor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum xdg_positioner_anchor anchor
     * }
     */
    public static final OfInt anchor$layout() {
        return anchor$LAYOUT;
    }

    private static final long anchor$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum xdg_positioner_anchor anchor
     * }
     */
    public static final long anchor$offset() {
        return anchor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum xdg_positioner_anchor anchor
     * }
     */
    public static int anchor(MemorySegment struct) {
        return struct.get(anchor$LAYOUT, anchor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum xdg_positioner_anchor anchor
     * }
     */
    public static void anchor(MemorySegment struct, int fieldValue) {
        struct.set(anchor$LAYOUT, anchor$OFFSET, fieldValue);
    }

    private static final OfInt gravity$LAYOUT = (OfInt)$LAYOUT.select(groupElement("gravity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum xdg_positioner_gravity gravity
     * }
     */
    public static final OfInt gravity$layout() {
        return gravity$LAYOUT;
    }

    private static final long gravity$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum xdg_positioner_gravity gravity
     * }
     */
    public static final long gravity$offset() {
        return gravity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum xdg_positioner_gravity gravity
     * }
     */
    public static int gravity(MemorySegment struct) {
        return struct.get(gravity$LAYOUT, gravity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum xdg_positioner_gravity gravity
     * }
     */
    public static void gravity(MemorySegment struct, int fieldValue) {
        struct.set(gravity$LAYOUT, gravity$OFFSET, fieldValue);
    }

    private static final OfInt constraint_adjustment$LAYOUT = (OfInt)$LAYOUT.select(groupElement("constraint_adjustment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum xdg_positioner_constraint_adjustment constraint_adjustment
     * }
     */
    public static final OfInt constraint_adjustment$layout() {
        return constraint_adjustment$LAYOUT;
    }

    private static final long constraint_adjustment$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum xdg_positioner_constraint_adjustment constraint_adjustment
     * }
     */
    public static final long constraint_adjustment$offset() {
        return constraint_adjustment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum xdg_positioner_constraint_adjustment constraint_adjustment
     * }
     */
    public static int constraint_adjustment(MemorySegment struct) {
        return struct.get(constraint_adjustment$LAYOUT, constraint_adjustment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum xdg_positioner_constraint_adjustment constraint_adjustment
     * }
     */
    public static void constraint_adjustment(MemorySegment struct, int fieldValue) {
        struct.set(constraint_adjustment$LAYOUT, constraint_adjustment$OFFSET, fieldValue);
    }

    private static final OfBoolean reactive$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("reactive"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool reactive
     * }
     */
    public static final OfBoolean reactive$layout() {
        return reactive$LAYOUT;
    }

    private static final long reactive$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool reactive
     * }
     */
    public static final long reactive$offset() {
        return reactive$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool reactive
     * }
     */
    public static boolean reactive(MemorySegment struct) {
        return struct.get(reactive$LAYOUT, reactive$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool reactive
     * }
     */
    public static void reactive(MemorySegment struct, boolean fieldValue) {
        struct.set(reactive$LAYOUT, reactive$OFFSET, fieldValue);
    }

    private static final OfBoolean has_parent_configure_serial$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("has_parent_configure_serial"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool has_parent_configure_serial
     * }
     */
    public static final OfBoolean has_parent_configure_serial$layout() {
        return has_parent_configure_serial$LAYOUT;
    }

    private static final long has_parent_configure_serial$OFFSET = 29;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool has_parent_configure_serial
     * }
     */
    public static final long has_parent_configure_serial$offset() {
        return has_parent_configure_serial$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool has_parent_configure_serial
     * }
     */
    public static boolean has_parent_configure_serial(MemorySegment struct) {
        return struct.get(has_parent_configure_serial$LAYOUT, has_parent_configure_serial$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool has_parent_configure_serial
     * }
     */
    public static void has_parent_configure_serial(MemorySegment struct, boolean fieldValue) {
        struct.set(has_parent_configure_serial$LAYOUT, has_parent_configure_serial$OFFSET, fieldValue);
    }

    private static final OfInt parent_configure_serial$LAYOUT = (OfInt)$LAYOUT.select(groupElement("parent_configure_serial"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t parent_configure_serial
     * }
     */
    public static final OfInt parent_configure_serial$layout() {
        return parent_configure_serial$LAYOUT;
    }

    private static final long parent_configure_serial$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t parent_configure_serial
     * }
     */
    public static final long parent_configure_serial$offset() {
        return parent_configure_serial$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t parent_configure_serial
     * }
     */
    public static int parent_configure_serial(MemorySegment struct) {
        return struct.get(parent_configure_serial$LAYOUT, parent_configure_serial$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t parent_configure_serial
     * }
     */
    public static void parent_configure_serial(MemorySegment struct, int fieldValue) {
        struct.set(parent_configure_serial$LAYOUT, parent_configure_serial$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     int32_t width;
     *     int32_t height;
     * }
     * }
     */
    public static class size {

        size() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            C.C_INT.withName("width"),
            C.C_INT.withName("height")
        ).withName("$anon$58:2");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("width"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * int32_t width
         * }
         */
        public static final OfInt width$layout() {
            return width$LAYOUT;
        }

        private static final long width$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * int32_t width
         * }
         */
        public static final long width$offset() {
            return width$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * int32_t width
         * }
         */
        public static int width(MemorySegment struct) {
            return struct.get(width$LAYOUT, width$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * int32_t width
         * }
         */
        public static void width(MemorySegment struct, int fieldValue) {
            struct.set(width$LAYOUT, width$OFFSET, fieldValue);
        }

        private static final OfInt height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("height"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * int32_t height
         * }
         */
        public static final OfInt height$layout() {
            return height$LAYOUT;
        }

        private static final long height$OFFSET = 4;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * int32_t height
         * }
         */
        public static final long height$offset() {
            return height$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * int32_t height
         * }
         */
        public static int height(MemorySegment struct) {
            return struct.get(height$LAYOUT, height$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * int32_t height
         * }
         */
        public static void height(MemorySegment struct, int fieldValue) {
            struct.set(height$LAYOUT, height$OFFSET, fieldValue);
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this struct
         */
        public static long sizeof() { return layout().byteSize(); }

        /**
         * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
         */
        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate(layout());
        }

        /**
         * Allocate an array of size {@code elementCount} using {@code allocator}.
         * The returned segment has size {@code elementCount * layout().byteSize()}.
         */
        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
         * The returned segment has size {@code layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
            return reinterpret(addr, 1, arena, cleanup);
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
         * The returned segment has size {@code elementCount * layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    private static final GroupLayout size$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t width;
     *     int32_t height;
     * } size
     * }
     */
    public static final GroupLayout size$layout() {
        return size$LAYOUT;
    }

    private static final long size$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t width;
     *     int32_t height;
     * } size
     * }
     */
    public static final long size$offset() {
        return size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t width;
     *     int32_t height;
     * } size
     * }
     */
    public static MemorySegment size(MemorySegment struct) {
        return struct.asSlice(size$OFFSET, size$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t width;
     *     int32_t height;
     * } size
     * }
     */
    public static void size(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, size$OFFSET, size$LAYOUT.byteSize());
    }

    private static final GroupLayout parent_size$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("parent_size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t width;
     *     int32_t height;
     * } parent_size
     * }
     */
    public static final GroupLayout parent_size$layout() {
        return parent_size$LAYOUT;
    }

    private static final long parent_size$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t width;
     *     int32_t height;
     * } parent_size
     * }
     */
    public static final long parent_size$offset() {
        return parent_size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t width;
     *     int32_t height;
     * } parent_size
     * }
     */
    public static MemorySegment parent_size(MemorySegment struct) {
        return struct.asSlice(parent_size$OFFSET, parent_size$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t width;
     *     int32_t height;
     * } parent_size
     * }
     */
    public static void parent_size(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_size$OFFSET, parent_size$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     int32_t x;
     *     int32_t y;
     * }
     * }
     */
    public static class offset {

        offset() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            C.C_INT.withName("x"),
            C.C_INT.withName("y")
        ).withName("$anon$62:2");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt x$LAYOUT = (OfInt)$LAYOUT.select(groupElement("x"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * int32_t x
         * }
         */
        public static final OfInt x$layout() {
            return x$LAYOUT;
        }

        private static final long x$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * int32_t x
         * }
         */
        public static final long x$offset() {
            return x$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * int32_t x
         * }
         */
        public static int x(MemorySegment struct) {
            return struct.get(x$LAYOUT, x$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * int32_t x
         * }
         */
        public static void x(MemorySegment struct, int fieldValue) {
            struct.set(x$LAYOUT, x$OFFSET, fieldValue);
        }

        private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * int32_t y
         * }
         */
        public static final OfInt y$layout() {
            return y$LAYOUT;
        }

        private static final long y$OFFSET = 4;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * int32_t y
         * }
         */
        public static final long y$offset() {
            return y$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * int32_t y
         * }
         */
        public static int y(MemorySegment struct) {
            return struct.get(y$LAYOUT, y$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * int32_t y
         * }
         */
        public static void y(MemorySegment struct, int fieldValue) {
            struct.set(y$LAYOUT, y$OFFSET, fieldValue);
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this struct
         */
        public static long sizeof() { return layout().byteSize(); }

        /**
         * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
         */
        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate(layout());
        }

        /**
         * Allocate an array of size {@code elementCount} using {@code allocator}.
         * The returned segment has size {@code elementCount * layout().byteSize()}.
         */
        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
         * The returned segment has size {@code layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
            return reinterpret(addr, 1, arena, cleanup);
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
         * The returned segment has size {@code elementCount * layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    private static final GroupLayout offset$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("offset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t x;
     *     int32_t y;
     * } offset
     * }
     */
    public static final GroupLayout offset$layout() {
        return offset$LAYOUT;
    }

    private static final long offset$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t x;
     *     int32_t y;
     * } offset
     * }
     */
    public static final long offset$offset() {
        return offset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t x;
     *     int32_t y;
     * } offset
     * }
     */
    public static MemorySegment offset(MemorySegment struct) {
        return struct.asSlice(offset$OFFSET, offset$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     int32_t x;
     *     int32_t y;
     * } offset
     * }
     */
    public static void offset(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, offset$OFFSET, offset$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

