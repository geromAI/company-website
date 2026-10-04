document.addEventListener("DOMContentLoaded", () => {

    const menuButton = document.getElementById("mobileMenuButton");
    const menu = document.getElementById("mobileMenu");

    if (!menuButton || !menu) {
        return;
    }

    menuButton.addEventListener("click", () => {

        const isOpen = menu.classList.toggle("active");

        menuButton.classList.toggle("active", isOpen);

        menuButton.setAttribute(
            "aria-expanded",
            String(isOpen)
        );

        menuButton.setAttribute(
            "aria-label",
            isOpen ? "Close navigation" : "Open navigation"
        );
    });


    /* Close menu when clicking a navigation link */
    menu.querySelectorAll("a").forEach(link => {

        link.addEventListener("click", () => {

            menu.classList.remove("active");
            menuButton.classList.remove("active");

            menuButton.setAttribute(
                "aria-expanded",
                "false"
            );

            menuButton.setAttribute(
                "aria-label",
                "Open navigation"
            );
        });

    });


    /* Close mobile menu when returning to desktop */
    window.addEventListener("resize", () => {

        if (window.innerWidth > 800) {

            menu.classList.remove("active");
            menuButton.classList.remove("active");

            menuButton.setAttribute(
                "aria-expanded",
                "false"
            );

            menuButton.setAttribute(
                "aria-label",
                "Open navigation"
            );
        }

    });

});