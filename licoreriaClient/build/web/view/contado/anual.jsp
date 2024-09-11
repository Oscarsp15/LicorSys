<jsp:include page="../templeate/head.jsp" />
<div class="content">
  <div class="container-fluid">
      <div class="row">
          <div class="col-md-3">
              <div class="card card-stats">
                  <div class="card-header card-header-info-amosis card-header-icon">
                      <div class="card-icon" data-header-animation="true">
                          <i class="fa fa-ticket-alt"></i>
                      </div>
                      <p class="card-category">Ventas</p>
                      <h3 class="card-title">0</h3>
                  </div>
                  <div class="card-footer">
                      <div class="stats">
                          Total de ventas hasta el momento
                      </div>
                  </div>
              </div>
          </div>
          <div class="col-md-3">
              <div class="card card-stats">
                  <div class="card-header card-header-marcas-amosis card-header-icon">
                  <div class="card-icon" data-header-animation="true">
                          <i class="fas fa-dollar-sign"></i>
                      </div>
                      <p class="card-category">Total de ventas</p>
                      <h3 class="card-title">S./ 0.00</h3>
                  </div>
                  <div class="card-footer">
                      <div class="stats">
                          Ganancias hasta el momento
                      </div>
                  </div>
              </div>
          </div>
          <div class="col-md-3">
              <div class="card card-stats">
                  <div class="card-header card-header-success-amosis card-header-icon">
                  <div class="card-icon" data-header-animation="true">
                          <i class="fas fa-dollar-sign"></i>
                      </div>
                      <p class="card-category">Ganacia de Ventas</p>
                      <h3 class="card-title">S./ 0.00</h3>
                  </div>
                  <div class="card-footer">
                      <div class="stats">
                          Ganancias hasta el momento
                      </div>
                  </div>
              </div>
          </div>
          <div class="col-md-3">
              <div class="card card-stats">
                  <div class="card-header card-header-categoria-amosis card-header-icon">
                  <div class="card-icon" data-header-animation="true">
                      <i class="fa fa-ban"></i>
                  </div>
                  <p class="card-category">Ventas Canceladas</p>
                  <h3 class="card-title">0</h3>
                  </div>
                  <div class="card-footer">
                      <div class="stats">
                        Ventas canceladas hasta el momento
                      </div>
                  </div>
              </div>
          </div>
          <div class="col-md-12">
              <div class="card">
              <div class="card-header card-header-amosis">
                  <h4 class="card-title">Ventas por año</h4>
                  <p class="card-category">Detalle de las ventas anuales</p>
              </div>
              <div class="card-body table-responsive">
                  <table id="example" class="table table-hover table-sm table-striped">
                      <thead class="text-primary-amosis">
                          <tr>
                              <th>Fecha / Hora</th>
                              <th>Usuario</th>
                              <th>Cliente</th>
                              <th>SubTotal</th>
                              <th>Descuento</th>
                              <th>Total</th>
                              <th>Efectivo</th>
                              <th>Cambio</th>
                              <th>Estado</th>
                              <th>Opciones</th>
                          </tr>
                      </thead>
                      <tbody>
                   
                      </tbody>
                  </table>
              </div>
              </div>
          </div>
      </div>
  </div>
</div>
<jsp:include page="../templeate/footer.jsp" />
