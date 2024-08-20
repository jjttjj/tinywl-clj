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
 * struct wlr_subcompositor {
 *     struct wl_global *global;
 *     struct wl_listener display_destroy;
 *     struct {
 *         struct wl_signal destroy;
 *     } events;
 * }
 * }
 */
public class wlr_subcompositor {

    wlr_subcompositor() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("global"),
        wl_listener.layout().withName("display_destroy"),
        wlr_subcompositor.events.layout().withName("events")
    ).withName("wlr_subcompositor");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout global$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("global"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wl_global *global
     * }
     */
    public static final AddressLayout global$layout() {
        return global$LAYOUT;
    }

    private static final long global$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wl_global *global
     * }
     */
    public static final long global$offset() {
        return global$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wl_global *global
     * }
     */
    public static MemorySegment global(MemorySegment struct) {
        return struct.get(global$LAYOUT, global$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wl_global *global
     * }
     */
    public static void global(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(global$LAYOUT, global$OFFSET, fieldValue);
    }

    private static final GroupLayout display_destroy$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("display_destroy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wl_listener display_destroy
     * }
     */
    public static final GroupLayout display_destroy$layout() {
        return display_destroy$LAYOUT;
    }

    private static final long display_destroy$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wl_listener display_destroy
     * }
     */
    public static final long display_destroy$offset() {
        return display_destroy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wl_listener display_destroy
     * }
     */
    public static MemorySegment display_destroy(MemorySegment struct) {
        return struct.asSlice(display_destroy$OFFSET, display_destroy$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wl_listener display_destroy
     * }
     */
    public static void display_destroy(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, display_destroy$OFFSET, display_destroy$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal destroy;
     * }
     * }
     */
    public static class events {

        events() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            wl_signal.layout().withName("destroy")
        ).withName("$anon$57:2");

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
     * } events
     * }
     */
    public static final GroupLayout events$layout() {
        return events$LAYOUT;
    }

    private static final long events$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal destroy;
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
     * } events
     * }
     */
    public static void events(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, events$OFFSET, events$LAYOUT.byteSize());
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

