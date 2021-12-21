import ImgDsDark from "assets/img/ImgDsDark.png"
function Navbar() {
    return (
        <div className="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-light border-bottom shadow-sm">
            <div className="container">
                <div className="row">
                    <nav className="my-2 my-md-0 mr-md-3 col-6">
                        <img src={ImgDsDark} alt="DevSuperior" width="120" />
                    </nav>
                    <nav className="my-2 my-md-0 mr-md-3 col-6">
                        <h1 className="o-text">Pepe</h1>
                    </nav>
                </div>
            </div>
        </div>
    );
}

export default Navbar;
