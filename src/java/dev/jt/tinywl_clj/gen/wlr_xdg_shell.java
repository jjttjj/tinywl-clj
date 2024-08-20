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
 * struct wlr_xdg_shell {
 *     struct wl_global *global;
 *     uint32_t version;
 *     struct wl_list clients;
 *     struct wl_list popup_grabs;
 *     uint32_t ping_timeout;
 *     struct wl_listener display_destroy;
 *     struct {
 *         struct wl_signal new_surface;
 *         struct wl_signal destroy;
 *     } events;
 *     void *data;
 * }
 * }
 */
public class wlr_xdg_shell {

    wlr_xdg_shell() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        C.C_POINTER.withName("global"),
        C.C_INT.withName("version"),
        MemoryLayout.paddingLayout(4),
        wl_list.layout().withName("clients"),
        wl_list.layout().withName("popup_grabs"),
        C.C_INT.withName("ping_timeout"),
        MemoryLayout.paddingLayout(4),
        wl_listener.layout().withName("display_destroy"),
        wlr_xdg_shell.events.layout().withName("events"),
        C.C_POINTER.withName("data")
    ).withName("wlr_xdg_shell");

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

    private static final OfInt version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t version
     * }
     */
    public static final OfInt version$layout() {
        return version$LAYOUT;
    }

    private static final long version$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t version
     * }
     */
    public static final long version$offset() {
        return version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t version
     * }
     */
    public static int version(MemorySegment struct) {
        return struct.get(version$LAYOUT, version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t version
     * }
     */
    public static void version(MemorySegment struct, int fieldValue) {
        struct.set(version$LAYOUT, version$OFFSET, fieldValue);
    }

    private static final GroupLayout clients$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("clients"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wl_list clients
     * }
     */
    public static final GroupLayout clients$layout() {
        return clients$LAYOUT;
    }

    private static final long clients$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wl_list clients
     * }
     */
    public static final long clients$offset() {
        return clients$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wl_list clients
     * }
     */
    public static MemorySegment clients(MemorySegment struct) {
        return struct.asSlice(clients$OFFSET, clients$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wl_list clients
     * }
     */
    public static void clients(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, clients$OFFSET, clients$LAYOUT.byteSize());
    }

    private static final GroupLayout popup_grabs$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("popup_grabs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct wl_list popup_grabs
     * }
     */
    public static final GroupLayout popup_grabs$layout() {
        return popup_grabs$LAYOUT;
    }

    private static final long popup_grabs$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct wl_list popup_grabs
     * }
     */
    public static final long popup_grabs$offset() {
        return popup_grabs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct wl_list popup_grabs
     * }
     */
    public static MemorySegment popup_grabs(MemorySegment struct) {
        return struct.asSlice(popup_grabs$OFFSET, popup_grabs$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct wl_list popup_grabs
     * }
     */
    public static void popup_grabs(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, popup_grabs$OFFSET, popup_grabs$LAYOUT.byteSize());
    }

    private static final OfInt ping_timeout$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ping_timeout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t ping_timeout
     * }
     */
    public static final OfInt ping_timeout$layout() {
        return ping_timeout$LAYOUT;
    }

    private static final long ping_timeout$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t ping_timeout
     * }
     */
    public static final long ping_timeout$offset() {
        return ping_timeout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t ping_timeout
     * }
     */
    public static int ping_timeout(MemorySegment struct) {
        return struct.get(ping_timeout$LAYOUT, ping_timeout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t ping_timeout
     * }
     */
    public static void ping_timeout(MemorySegment struct, int fieldValue) {
        struct.set(ping_timeout$LAYOUT, ping_timeout$OFFSET, fieldValue);
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

    private static final long display_destroy$OFFSET = 56;

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
     *     struct wl_signal new_surface;
     *     struct wl_signal destroy;
     * }
     * }
     */
    public static class events {

        events() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            wl_signal.layout().withName("new_surface"),
            wl_signal.layout().withName("destroy")
        ).withName("$anon$27:2");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final GroupLayout new_surface$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("new_surface"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct wl_signal new_surface
         * }
         */
        public static final GroupLayout new_surface$layout() {
            return new_surface$LAYOUT;
        }

        private static final long new_surface$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct wl_signal new_surface
         * }
         */
        public static final long new_surface$offset() {
            return new_surface$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct wl_signal new_surface
         * }
         */
        public static MemorySegment new_surface(MemorySegment struct) {
            return struct.asSlice(new_surface$OFFSET, new_surface$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct wl_signal new_surface
         * }
         */
        public static void new_surface(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, new_surface$OFFSET, new_surface$LAYOUT.byteSize());
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

        private static final long destroy$OFFSET = 16;

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
     *     struct wl_signal new_surface;
     *     struct wl_signal destroy;
     * } events
     * }
     */
    public static final GroupLayout events$layout() {
        return events$LAYOUT;
    }

    private static final long events$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     struct wl_signal new_surface;
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
     *     struct wl_signal new_surface;
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
     *     struct wl_signal new_surface;
     *     struct wl_signal destroy;
     * } events
     * }
     */
    public static void events(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, events$OFFSET, events$LAYOUT.byteSize());
    }

    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, data$OFFSET, fieldValue);
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
