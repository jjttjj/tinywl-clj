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
 * struct wlr_render_texture_options {
 *     struct wlr_texture *texture;
 *     struct wlr_fbox src_box;
 *     struct wlr_box dst_box;
 *     const float *alpha;
 *     const pixman_region32_t *clip;
 *     enum wl_output_transform transform;
 *     enum wlr_scale_filter_mode filter_mode;
 *     enum wlr_render_blend_mode blend_mode;
 * }
 * }
 */
public class wlr_render_texture_options {

    wlr_render_texture_options() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("texture"),
        wlr_fbox.layout().withName("src_box"),
        wlr_box.layout().withName("dst_box"),
        C.C_POINTER.withName("alpha"),
        C.C_POINTER.withName("clip"),
        C.C_INT.withName("transform"),
        C.C_INT.withName("filter_mode"),
        C.C_INT.withName("blend_mode"),
        MemoryLayout.paddingLayout(4)
    ).withName("wlr_render_texture_options");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout texture$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("texture"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_texture *texture
     * }
     */
    public static final AddressLayout texture$layout() {
        return texture$LAYOUT;
    }

    private static final long texture$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_texture *texture
     * }
     */
    public static final long texture$offset() {
        return texture$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_texture *texture
     * }
     */
    public static MemorySegment texture(MemorySegment struct) {
        return struct.get(texture$LAYOUT, texture$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_texture *texture
     * }
     */
    public static void texture(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(texture$LAYOUT, texture$OFFSET, fieldValue);
    }

    private static final GroupLayout src_box$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("src_box"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_fbox src_box
     * }
     */
    public static final GroupLayout src_box$layout() {
        return src_box$LAYOUT;
    }

    private static final long src_box$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_fbox src_box
     * }
     */
    public static final long src_box$offset() {
        return src_box$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_fbox src_box
     * }
     */
    public static MemorySegment src_box(MemorySegment struct) {
        return struct.asSlice(src_box$OFFSET, src_box$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_fbox src_box
     * }
     */
    public static void src_box(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, src_box$OFFSET, src_box$LAYOUT.byteSize());
    }

    private static final GroupLayout dst_box$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("dst_box"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_box dst_box
     * }
     */
    public static final GroupLayout dst_box$layout() {
        return dst_box$LAYOUT;
    }

    private static final long dst_box$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_box dst_box
     * }
     */
    public static final long dst_box$offset() {
        return dst_box$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_box dst_box
     * }
     */
    public static MemorySegment dst_box(MemorySegment struct) {
        return struct.asSlice(dst_box$OFFSET, dst_box$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_box dst_box
     * }
     */
    public static void dst_box(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, dst_box$OFFSET, dst_box$LAYOUT.byteSize());
    }

    private static final AddressLayout alpha$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("alpha"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const float *alpha
     * }
     */
    public static final AddressLayout alpha$layout() {
        return alpha$LAYOUT;
    }

    private static final long alpha$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const float *alpha
     * }
     */
    public static final long alpha$offset() {
        return alpha$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const float *alpha
     * }
     */
    public static MemorySegment alpha(MemorySegment struct) {
        return struct.get(alpha$LAYOUT, alpha$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const float *alpha
     * }
     */
    public static void alpha(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(alpha$LAYOUT, alpha$OFFSET, fieldValue);
    }

    private static final AddressLayout clip$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("clip"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const pixman_region32_t *clip
     * }
     */
    public static final AddressLayout clip$layout() {
        return clip$LAYOUT;
    }

    private static final long clip$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const pixman_region32_t *clip
     * }
     */
    public static final long clip$offset() {
        return clip$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const pixman_region32_t *clip
     * }
     */
    public static MemorySegment clip(MemorySegment struct) {
        return struct.get(clip$LAYOUT, clip$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const pixman_region32_t *clip
     * }
     */
    public static void clip(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(clip$LAYOUT, clip$OFFSET, fieldValue);
    }

    private static final OfInt transform$LAYOUT = (OfInt)$LAYOUT.select(groupElement("transform"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum wl_output_transform transform
     * }
     */
    public static final OfInt transform$layout() {
        return transform$LAYOUT;
    }

    private static final long transform$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum wl_output_transform transform
     * }
     */
    public static final long transform$offset() {
        return transform$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum wl_output_transform transform
     * }
     */
    public static int transform(MemorySegment struct) {
        return struct.get(transform$LAYOUT, transform$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum wl_output_transform transform
     * }
     */
    public static void transform(MemorySegment struct, int fieldValue) {
        struct.set(transform$LAYOUT, transform$OFFSET, fieldValue);
    }

    private static final OfInt filter_mode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("filter_mode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum wlr_scale_filter_mode filter_mode
     * }
     */
    public static final OfInt filter_mode$layout() {
        return filter_mode$LAYOUT;
    }

    private static final long filter_mode$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum wlr_scale_filter_mode filter_mode
     * }
     */
    public static final long filter_mode$offset() {
        return filter_mode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum wlr_scale_filter_mode filter_mode
     * }
     */
    public static int filter_mode(MemorySegment struct) {
        return struct.get(filter_mode$LAYOUT, filter_mode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum wlr_scale_filter_mode filter_mode
     * }
     */
    public static void filter_mode(MemorySegment struct, int fieldValue) {
        struct.set(filter_mode$LAYOUT, filter_mode$OFFSET, fieldValue);
    }

    private static final OfInt blend_mode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("blend_mode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * enum wlr_render_blend_mode blend_mode
     * }
     */
    public static final OfInt blend_mode$layout() {
        return blend_mode$LAYOUT;
    }

    private static final long blend_mode$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * enum wlr_render_blend_mode blend_mode
     * }
     */
    public static final long blend_mode$offset() {
        return blend_mode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * enum wlr_render_blend_mode blend_mode
     * }
     */
    public static int blend_mode(MemorySegment struct) {
        return struct.get(blend_mode$LAYOUT, blend_mode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * enum wlr_render_blend_mode blend_mode
     * }
     */
    public static void blend_mode(MemorySegment struct, int fieldValue) {
        struct.set(blend_mode$LAYOUT, blend_mode$OFFSET, fieldValue);
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
