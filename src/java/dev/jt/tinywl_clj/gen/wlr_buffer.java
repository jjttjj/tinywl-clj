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
 * struct wlr_buffer {
 *     const struct wlr_buffer_impl *impl;
 *     int width;
 *     int height;
 *     bool dropped;
 *     size_t n_locks;
 *     bool accessing_data_ptr;
 *     struct {
 *         struct wl_signal destroy;
 *         struct wl_signal release;
 *     } events;
 *     struct wlr_addon_set addons;
 * }
 * }
 */
public class wlr_buffer {

    wlr_buffer() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("impl"),
        C.C_INT.withName("width"),
        C.C_INT.withName("height"),
        C.C_BOOL.withName("dropped"),
        MemoryLayout.paddingLayout(7),
        C.C_LONG.withName("n_locks"),
        C.C_BOOL.withName("accessing_data_ptr"),
        MemoryLayout.paddingLayout(7),
        wlr_buffer.events.layout().withName("events"),
        wlr_addon_set.layout().withName("addons")
    ).withName("wlr_buffer");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout impl$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("impl"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const struct wlr_buffer_impl *impl
     * }
     */
    public static final AddressLayout impl$layout() {
        return impl$LAYOUT;
    }

    private static final long impl$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const struct wlr_buffer_impl *impl
     * }
     */
    public static final long impl$offset() {
        return impl$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const struct wlr_buffer_impl *impl
     * }
     */
    public static MemorySegment impl(MemorySegment struct) {
        return struct.get(impl$LAYOUT, impl$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const struct wlr_buffer_impl *impl
     * }
     */
    public static void impl(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(impl$LAYOUT, impl$OFFSET, fieldValue);
    }

    private static final OfInt width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static final OfInt width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static int width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static void width(MemorySegment struct, int fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfInt height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static final OfInt height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static int height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static void height(MemorySegment struct, int fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final OfBoolean dropped$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("dropped"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool dropped
     * }
     */
    public static final OfBoolean dropped$layout() {
        return dropped$LAYOUT;
    }

    private static final long dropped$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool dropped
     * }
     */
    public static final long dropped$offset() {
        return dropped$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool dropped
     * }
     */
    public static boolean dropped(MemorySegment struct) {
        return struct.get(dropped$LAYOUT, dropped$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool dropped
     * }
     */
    public static void dropped(MemorySegment struct, boolean fieldValue) {
        struct.set(dropped$LAYOUT, dropped$OFFSET, fieldValue);
    }

    private static final OfLong n_locks$LAYOUT = (OfLong)$LAYOUT.select(groupElement("n_locks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * size_t n_locks
     * }
     */
    public static final OfLong n_locks$layout() {
        return n_locks$LAYOUT;
    }

    private static final long n_locks$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * size_t n_locks
     * }
     */
    public static final long n_locks$offset() {
        return n_locks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * size_t n_locks
     * }
     */
    public static long n_locks(MemorySegment struct) {
        return struct.get(n_locks$LAYOUT, n_locks$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * size_t n_locks
     * }
     */
    public static void n_locks(MemorySegment struct, long fieldValue) {
        struct.set(n_locks$LAYOUT, n_locks$OFFSET, fieldValue);
    }

    private static final OfBoolean accessing_data_ptr$LAYOUT = (OfBoolean)$LAYOUT.select(groupElement("accessing_data_ptr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * bool accessing_data_ptr
     * }
     */
    public static final OfBoolean accessing_data_ptr$layout() {
        return accessing_data_ptr$LAYOUT;
    }

    private static final long accessing_data_ptr$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * bool accessing_data_ptr
     * }
     */
    public static final long accessing_data_ptr$offset() {
        return accessing_data_ptr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * bool accessing_data_ptr
     * }
     */
    public static boolean accessing_data_ptr(MemorySegment struct) {
        return struct.get(accessing_data_ptr$LAYOUT, accessing_data_ptr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * bool accessing_data_ptr
     * }
     */
    public static void accessing_data_ptr(MemorySegment struct, boolean fieldValue) {
        struct.set(accessing_data_ptr$LAYOUT, accessing_data_ptr$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal destroy;
     *     struct wl_signal release;
     * }
     * }
     */
    public static class events {

        events() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            wl_signal.layout().withName("destroy"),
            wl_signal.layout().withName("release")
        ).withName("$anon$56:2");

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

        private static final GroupLayout release$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("release"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal release
         * }
         */
        public static final GroupLayout release$layout() {
            return release$LAYOUT;
        }

        private static final long release$OFFSET = 16;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal release
         * }
         */
        public static final long release$offset() {
            return release$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal release
         * }
         */
        public static MemorySegment release(MemorySegment struct) {
            return struct.asSlice(release$OFFSET, release$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal release
         * }
         */
        public static void release(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, release$OFFSET, release$LAYOUT.byteSize());
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
     *     struct wl_signal release;
     * } events
     * }
     */
    public static final GroupLayout events$layout() {
        return events$LAYOUT;
    }

    private static final long events$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal destroy;
     *     struct wl_signal release;
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
     *     struct wl_signal release;
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
     *     struct wl_signal release;
     * } events
     * }
     */
    public static void events(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, events$OFFSET, events$LAYOUT.byteSize());
    }

    private static final GroupLayout addons$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("addons"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wlr_addon_set addons
     * }
     */
    public static final GroupLayout addons$layout() {
        return addons$LAYOUT;
    }

    private static final long addons$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wlr_addon_set addons
     * }
     */
    public static final long addons$offset() {
        return addons$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wlr_addon_set addons
     * }
     */
    public static MemorySegment addons(MemorySegment struct) {
        return struct.asSlice(addons$OFFSET, addons$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wlr_addon_set addons
     * }
     */
    public static void addons(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, addons$OFFSET, addons$LAYOUT.byteSize());
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

