import Navbar from "components/navbar";
import Footer from "components/footer";
import DataTable from "components/datatable";
import BarChart from "components/barchart";
import DonoutChart from "components/DonoutChart";
function App() {
  return (
    <>
      <Navbar />
      <div className="container">
        <h1 className="o-text py-3">Dashboard De Venda</h1>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Todas as Vendas</h5>
            <DonoutChart /> 
          </div>
        </div>
        <div className="py-3">
          <h2 className="o-text">Todas as Vendas</h2>
        </div>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
