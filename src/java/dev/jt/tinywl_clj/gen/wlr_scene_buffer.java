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
 * struct wlr_scene_buffer {
 *     struct wlr_scene_node node;
 *     struct wlr_buffer *buffer;
 *     struct {
 *         struct wl_signal outputs_update;
 *         struct wl_signal output_enter;
 *         struct wl_signal output_leave;
 *         struct wl_signal output_sample;
 *         struct wl_signal frame_done;
 *     } events;
 *     wlr_scene_buffer_point_accepts_input_func_t point_accepts_input;
 *     struct wlr_scene_output *primary_output;
 *     float opacity;
 *     enum wlr_scale_filter_mode filter_mode;
 *     struct wlr_fbox src_box;
 *     int dst_width;
 *     int dst_height;
 *     enum wl_output_transform transform;
 *     pixman_region32_t opaque_region;
 *     uint64_t active_outputs;
 *     struct wlr_texture *texture;
 *     struct wlr_linux_dmabuf_feedback_v1_init_options prev_feedback_options;
 * }
 * }
 */
public class wlr_scene_buffer {

    wlr_scene_buffer() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wlr_scene_node.layout().withName("node"),
        C.C_POINTER.withName("buffer"),
        wlr_scene_buffer.events.layout().withName("events"),
        C.C_POINTER.withName("point_accepts_input"),
        C.C_POINTER.withName("primary_output"),
        C.C_FLOAT.withName("opacity"),
        C.C_INT.withName("filter_mode"),
        wlr_fbox.layout().withName("src_box"),
        C.C_INT.withName("dst_width"),
        C.C_INT.withName("dst_height"),
        C.C_INT.withName("transform"),
        MemoryLayout.paddingLayout(4),
        pixman_region32.layout().withName("opaque_region"),
        C.C_LONG.withName("active_outputs"),
        C.C_POINTER.withName("texture"),
        wlr_linux_dmabuf_feedback_v1_init_options.layout().withName("prev_feedback_options")
    ).withName("wlr_scene_buffer");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout node$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("node"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_scene_node node
     * }
     */
    public static final GroupLayout node$layout() {
        return node$LAYOUT;
    }

    private static final long node$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_scene_node node
     * }
     */
    public static final long node$offset() {
        return node$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_scene_node node
     * }
     */
    public static MemorySegment node(MemorySegment struct) {
        return struct.asSlice(node$OFFSET, node$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_scene_node node
     * }
     */
    public static void node(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, node$OFFSET, node$LAYOUT.byteSize());
    }

    private static final AddressLayout buffer$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("buffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_buffer *buffer
     * }
     */
    public static final AddressLayout buffer$layout() {
        return buffer$LAYOUT;
    }

    private static final long buffer$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_buffer *buffer
     * }
     */
    public static final long buffer$offset() {
        return buffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_buffer *buffer
     * }
     */
    public static MemorySegment buffer(MemorySegment struct) {
        return struct.get(buffer$LAYOUT, buffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_buffer *buffer
     * }
     */
    public static void buffer(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(buffer$LAYOUT, buffer$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal outputs_update;
     *     struct wl_signal output_enter;
     *     struct wl_signal output_leave;
     *     struct wl_signal output_sample;
     *     struct wl_signal frame_done;
     * }
     * }
     */
    public static class events {

        events() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            wl_signal.layout().withName("outputs_update"),
            wl_signal.layout().withName("output_enter"),
            wl_signal.layout().withName("output_leave"),
            wl_signal.layout().withName("output_sample"),
            wl_signal.layout().withName("frame_done")
        ).withName("$anon$159:2");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final GroupLayout outputs_update$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("outputs_update"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal outputs_update
         * }
         */
        public static final GroupLayout outputs_update$layout() {
            return outputs_update$LAYOUT;
        }

        private static final long outputs_update$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal outputs_update
         * }
         */
        public static final long outputs_update$offset() {
            return outputs_update$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal outputs_update
         * }
         */
        public static MemorySegment outputs_update(MemorySegment struct) {
            return struct.asSlice(outputs_update$OFFSET, outputs_update$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal outputs_update
         * }
         */
        public static void outputs_update(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, outputs_update$OFFSET, outputs_update$LAYOUT.byteSize());
        }

        private static final GroupLayout output_enter$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("output_enter"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal output_enter
         * }
         */
        public static final GroupLayout output_enter$layout() {
            return output_enter$LAYOUT;
        }

        private static final long output_enter$OFFSET = 16;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal output_enter
         * }
         */
        public static final long output_enter$offset() {
            return output_enter$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal output_enter
         * }
         */
        public static MemorySegment output_enter(MemorySegment struct) {
            return struct.asSlice(output_enter$OFFSET, output_enter$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal output_enter
         * }
         */
        public static void output_enter(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, output_enter$OFFSET, output_enter$LAYOUT.byteSize());
        }

        private static final GroupLayout output_leave$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("output_leave"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal output_leave
         * }
         */
        public static final GroupLayout output_leave$layout() {
            return output_leave$LAYOUT;
        }

        private static final long output_leave$OFFSET = 32;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal output_leave
         * }
         */
        public static final long output_leave$offset() {
            return output_leave$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal output_leave
         * }
         */
        public static MemorySegment output_leave(MemorySegment struct) {
            return struct.asSlice(output_leave$OFFSET, output_leave$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal output_leave
         * }
         */
        public static void output_leave(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, output_leave$OFFSET, output_leave$LAYOUT.byteSize());
        }

        private static final GroupLayout output_sample$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("output_sample"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal output_sample
         * }
         */
        public static final GroupLayout output_sample$layout() {
            return output_sample$LAYOUT;
        }

        private static final long output_sample$OFFSET = 48;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal output_sample
         * }
         */
        public static final long output_sample$offset() {
            return output_sample$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal output_sample
         * }
         */
        public static MemorySegment output_sample(MemorySegment struct) {
            return struct.asSlice(output_sample$OFFSET, output_sample$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal output_sample
         * }
         */
        public static void output_sample(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, output_sample$OFFSET, output_sample$LAYOUT.byteSize());
        }

        private static final GroupLayout frame_done$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("frame_done"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal frame_done
         * }
         */
        public static final GroupLayout frame_done$layout() {
            return frame_done$LAYOUT;
        }

        private static final long frame_done$OFFSET = 64;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal frame_done
         * }
         */
        public static final long frame_done$offset() {
            return frame_done$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal frame_done
         * }
         */
        public static MemorySegment frame_done(MemorySegment struct) {
            return struct.asSlice(frame_done$OFFSET, frame_done$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal frame_done
         * }
         */
        public static void frame_done(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, frame_done$OFFSET, frame_done$LAYOUT.byteSize());
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

    private static final GroupLayout events$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("events"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal outputs_update;
     *     struct wl_signal output_enter;
     *     struct wl_signal output_leave;
     *     struct wl_signal output_sample;
     *     struct wl_signal frame_done;
     * } events
     * }
     */
    public static final GroupLayout events$layout() {
        return events$LAYOUT;
    }

    private static final long events$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal outputs_update;
     *     struct wl_signal output_enter;
     *     struct wl_signal output_leave;
     *     struct wl_signal output_sample;
     *     struct wl_signal frame_done;
     * } events
     * }
     */
    public static final long events$offset() {
        return events$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal outputs_update;
     *     struct wl_signal output_enter;
     *     struct wl_signal output_leave;
     *     struct wl_signal output_sample;
     *     struct wl_signal frame_done;
     * } events
     * }
     */
    public static MemorySegment events(MemorySegment struct) {
        return struct.asSlice(events$OFFSET, events$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal outputs_update;
     *     struct wl_signal output_enter;
     *     struct wl_signal output_leave;
     *     struct wl_signal output_sample;
     *     struct wl_signal frame_done;
     * } events
     * }
     */
    public static void events(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, events$OFFSET, events$LAYOUT.byteSize());
    }

    private static final AddressLayout point_accepts_input$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("point_accepts_input"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * wlr_scene_buffer_point_accepts_input_func_t point_accepts_input
     * }
     */
    public static final AddressLayout point_accepts_input$layout() {
        return point_accepts_input$LAYOUT;
    }

    private static final long point_accepts_input$OFFSET = 200;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * wlr_scene_buffer_point_accepts_input_func_t point_accepts_input
     * }
     */
    public static final long point_accepts_input$offset() {
        return point_accepts_input$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * wlr_scene_buffer_point_accepts_input_func_t point_accepts_input
     * }
     */
    public static MemorySegment point_accepts_input(MemorySegment struct) {
        return struct.get(point_accepts_input$LAYOUT, point_accepts_input$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * wlr_scene_buffer_point_accepts_input_func_t point_accepts_input
     * }
     */
    public static void point_accepts_input(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(point_accepts_input$LAYOUT, point_accepts_input$OFFSET, fieldValue);
    }

    private static final AddressLayout primary_output$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("primary_output"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_scene_output *primary_output
     * }
     */
    public static final AddressLayout primary_output$layout() {
        return primary_output$LAYOUT;
    }

    private static final long primary_output$OFFSET = 208;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_scene_output *primary_output
     * }
     */
    public static final long primary_output$offset() {
        return primary_output$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_scene_output *primary_output
     * }
     */
    public static MemorySegment primary_output(MemorySegment struct) {
        return struct.get(primary_output$LAYOUT, primary_output$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_scene_output *primary_output
     * }
     */
    public static void primary_output(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(primary_output$LAYOUT, primary_output$OFFSET, fieldValue);
    }

    private static final OfFloat opacity$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("opacity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * float opacity
     * }
     */
    public static final OfFloat opacity$layout() {
        return opacity$LAYOUT;
    }

    private static final long opacity$OFFSET = 216;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * float opacity
     * }
     */
    public static final long opacity$offset() {
        return opacity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * float opacity
     * }
     */
    public static float opacity(MemorySegment struct) {
        return struct.get(opacity$LAYOUT, opacity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * float opacity
     * }
     */
    public static void opacity(MemorySegment struct, float fieldValue) {
        struct.set(opacity$LAYOUT, opacity$OFFSET, fieldValue);
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

    private static final long filter_mode$OFFSET = 220;

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

    private static final long src_box$OFFSET = 224;

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

    private static final OfInt dst_width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dst_width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int dst_width
     * }
     */
    public static final OfInt dst_width$layout() {
        return dst_width$LAYOUT;
    }

    private static final long dst_width$OFFSET = 256;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int dst_width
     * }
     */
    public static final long dst_width$offset() {
        return dst_width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int dst_width
     * }
     */
    public static int dst_width(MemorySegment struct) {
        return struct.get(dst_width$LAYOUT, dst_width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int dst_width
     * }
     */
    public static void dst_width(MemorySegment struct, int fieldValue) {
        struct.set(dst_width$LAYOUT, dst_width$OFFSET, fieldValue);
    }

    private static final OfInt dst_height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dst_height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int dst_height
     * }
     */
    public static final OfInt dst_height$layout() {
        return dst_height$LAYOUT;
    }

    private static final long dst_height$OFFSET = 260;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int dst_height
     * }
     */
    public static final long dst_height$offset() {
        return dst_height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int dst_height
     * }
     */
    public static int dst_height(MemorySegment struct) {
        return struct.get(dst_height$LAYOUT, dst_height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int dst_height
     * }
     */
    public static void dst_height(MemorySegment struct, int fieldValue) {
        struct.set(dst_height$LAYOUT, dst_height$OFFSET, fieldValue);
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

    private static final long transform$OFFSET = 264;

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

    private static final GroupLayout opaque_region$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("opaque_region"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * pixman_region32_t opaque_region
     * }
     */
    public static final GroupLayout opaque_region$layout() {
        return opaque_region$LAYOUT;
    }

    private static final long opaque_region$OFFSET = 272;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * pixman_region32_t opaque_region
     * }
     */
    public static final long opaque_region$offset() {
        return opaque_region$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * pixman_region32_t opaque_region
     * }
     */
    public static MemorySegment opaque_region(MemorySegment struct) {
        return struct.asSlice(opaque_region$OFFSET, opaque_region$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * pixman_region32_t opaque_region
     * }
     */
    public static void opaque_region(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, opaque_region$OFFSET, opaque_region$LAYOUT.byteSize());
    }

    private static final OfLong active_outputs$LAYOUT = (OfLong)$LAYOUT.select(groupElement("active_outputs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint64_t active_outputs
     * }
     */
    public static final OfLong active_outputs$layout() {
        return active_outputs$LAYOUT;
    }

    private static final long active_outputs$OFFSET = 296;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint64_t active_outputs
     * }
     */
    public static final long active_outputs$offset() {
        return active_outputs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint64_t active_outputs
     * }
     */
    public static long active_outputs(MemorySegment struct) {
        return struct.get(active_outputs$LAYOUT, active_outputs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint64_t active_outputs
     * }
     */
    public static void active_outputs(MemorySegment struct, long fieldValue) {
        struct.set(active_outputs$LAYOUT, active_outputs$OFFSET, fieldValue);
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

    private static final long texture$OFFSET = 304;

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

    private static final GroupLayout prev_feedback_options$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("prev_feedback_options"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_linux_dmabuf_feedback_v1_init_options prev_feedback_options
     * }
     */
    public static final GroupLayout prev_feedback_options$layout() {
        return prev_feedback_options$LAYOUT;
    }

    private static final long prev_feedback_options$OFFSET = 312;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_linux_dmabuf_feedback_v1_init_options prev_feedback_options
     * }
     */
    public static final long prev_feedback_options$offset() {
        return prev_feedback_options$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_linux_dmabuf_feedback_v1_init_options prev_feedback_options
     * }
     */
    public static MemorySegment prev_feedback_options(MemorySegment struct) {
        return struct.asSlice(prev_feedback_options$OFFSET, prev_feedback_options$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_linux_dmabuf_feedback_v1_init_options prev_feedback_options
     * }
     */
    public static void prev_feedback_options(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, prev_feedback_options$OFFSET, prev_feedback_options$LAYOUT.byteSize());
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

