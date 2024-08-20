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
 * struct wlr_renderer {
 *     struct {
 *         struct wl_signal destroy;
 *         struct wl_signal lost;
 *     } events;
 *     const struct wlr_renderer_impl *impl;
 *     bool rendering;
 *     bool rendering_with_buffer;
 * }
 * }
 */
public class wlr_renderer {

    wlr_renderer() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        wlr_renderer.events.layout().withName("events"),
        C.C_POINTER.withName("impl"),
        C.C_BOOL.withName("rendering"),
        C.C_BOOL.withName("rendering_with_buffer"),
        MemoryLayout.paddingLayout(6)
    ).withName("wlr_renderer");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal destroy;
     *     struct wl_signal lost;
     * }
     * }
     */
    public static class events {

        events() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            wl_signal.layout().withName("destroy"),
            wl_signal.layout().withName("lost")
        ).withName("$anon$29:2");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final GroupLayout destroy$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("destroy"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal destroy
         * }
         */
        public static final GroupLayout destroy$layout() {
            return destroy$LAYOUT;
        }

        private static final long destroy$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal destroy
         * }
         */
        public static final long destroy$offset() {
            return destroy$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal destroy
         * }
         */
        public static MemorySegment destroy(MemorySegment struct) {
            return struct.asSlice(destroy$OFFSET, destroy$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal destroy
         * }
         */
        public static void destroy(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, destroy$OFFSET, destroy$LAYOUT.byteSize());
        }

        private static final GroupLayout lost$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("lost"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal lost
         * }
         */
        public static final GroupLayout lost$layout() {
            return lost$LAYOUT;
        }

        private static final long lost$OFFSET = 16;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal lost
         * }
         */
        public static final long lost$offset() {
            return lost$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal lost
         * }
         */
        public static MemorySegment lost(MemorySegment struct) {
            return struct.asSlice(lost$OFFSET, lost$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal lost
         * }
         */
        public static void lost(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, lost$OFFSET, lost$LAYOUT.byteSize());
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
     *     struct wl_signal destroy;
     *     struct wl_signal lost;
     * } events
     * }
     */
    public static final GroupLayout events$layout() {
        return events$LAYOUT;
    }

    private static final long events$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal destroy;
     *     struct wl_signal lost;
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
     *     struct wl_signal destroy;
     *     struct wl_signal lost;
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
     *     struct wl_signal destroy;
     *     struct wl_signal lost;
     * } events
     * }
     */
    public static void events(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, events$OFFSET, events$LAYOUT.byteSize());
    }

    private static final AddressLayout impl$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("impl"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const struct wlr_renderer_impl *impl
     * }
     */
    public static final AddressLayout impl$layout() {
        return impl$LAYOUT;
    }

    private static final long impl$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const struct wlr_renderer_impl *impl
     * }
     */
    public static final long impl$offset() {
        return impl$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const struct wlr_renderer_impl *impl
     * }
     */
    public static MemorySegment impl(MemorySegment struct) {
        return struct.get(impl$LAYOUT, impl$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const struct wlr_renderer_impl *impl
     * }
     */
    public static void impl(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(impl$LAYOUT, impl$OFFSET, fieldValue);
    }

    private static final OfBoolean rendering$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("rendering"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool rendering
     * }
     */
    public static final OfBoolean rendering$layout() {
        return rendering$LAYOUT;
    }

    private static final long rendering$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool rendering
     * }
     */
    public static final long rendering$offset() {
        return rendering$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool rendering
     * }
     */
    public static boolean rendering(MemorySegment struct) {
        return struct.get(rendering$LAYOUT, rendering$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool rendering
     * }
     */
    public static void rendering(MemorySegment struct, boolean fieldValue) {
        struct.set(rendering$LAYOUT, rendering$OFFSET, fieldValue);
    }

    private static final OfBoolean rendering_with_buffer$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("rendering_with_buffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool rendering_with_buffer
     * }
     */
    public static final OfBoolean rendering_with_buffer$layout() {
        return rendering_with_buffer$LAYOUT;
    }

    private static final long rendering_with_buffer$OFFSET = 41;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool rendering_with_buffer
     * }
     */
    public static final long rendering_with_buffer$offset() {
        return rendering_with_buffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool rendering_with_buffer
     * }
     */
    public static boolean rendering_with_buffer(MemorySegment struct) {
        return struct.get(rendering_with_buffer$LAYOUT, rendering_with_buffer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool rendering_with_buffer
     * }
     */
    public static void rendering_with_buffer(MemorySegment struct, boolean fieldValue) {
        struct.set(rendering_with_buffer$LAYOUT, rendering_with_buffer$OFFSET, fieldValue);
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

