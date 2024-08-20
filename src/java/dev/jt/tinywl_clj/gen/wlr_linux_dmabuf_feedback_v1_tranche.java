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
 * struct wlr_linux_dmabuf_feedback_v1_tranche {
 *     dev_t target_device;
 *     uint32_t flags;
 *     struct wlr_drm_format_set formats;
 * }
 * }
 */
public class wlr_linux_dmabuf_feedback_v1_tranche {

    wlr_linux_dmabuf_feedback_v1_tranche() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_LONG.withName("target_device"),
        C.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(4),
        wlr_drm_format_set.layout().withName("formats")
    ).withName("wlr_linux_dmabuf_feedback_v1_tranche");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong target_device$LAYOUT = (OfLong)$LAYOUT.select(groupElement("target_device"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * dev_t target_device
     * }
     */
    public static final OfLong target_device$layout() {
        return target_device$LAYOUT;
    }

    private static final long target_device$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * dev_t target_device
     * }
     */
    public static final long target_device$offset() {
        return target_device$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * dev_t target_device
     * }
     */
    public static long target_device(MemorySegment struct) {
        return struct.get(target_device$LAYOUT, target_device$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * dev_t target_device
     * }
     */
    public static void target_device(MemorySegment struct, long fieldValue) {
        struct.set(target_device$LAYOUT, target_device$OFFSET, fieldValue);
    }

    private static final OfInt flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t flags
     * }
     */
    public static final OfInt flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t flags
     * }
     */
    public static int flags(MemorySegment struct) {
        return struct.get(flags$LAYOUT, flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t flags
     * }
     */
    public static void flags(MemorySegment struct, int fieldValue) {
        struct.set(flags$LAYOUT, flags$OFFSET, fieldValue);
    }

    private static final GroupLayout formats$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("formats"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_drm_format_set formats
     * }
     */
    public static final GroupLayout formats$layout() {
        return formats$LAYOUT;
    }

    private static final long formats$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_drm_format_set formats
     * }
     */
    public static final long formats$offset() {
        return formats$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_drm_format_set formats
     * }
     */
    public static MemorySegment formats(MemorySegment struct) {
        return struct.asSlice(formats$OFFSET, formats$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_drm_format_set formats
     * }
     */
    public static void formats(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, formats$OFFSET, formats$LAYOUT.byteSize());
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

